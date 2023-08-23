from django.shortcuts import render
from django.shortcuts import render
from tensorflow.keras.preprocessing import image
from tensorflow.keras import models
import numpy as np
from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt
from django.conf import settings

# Create your views here.
@csrf_exempt
def catordog(request):
    img_path = request.POST['id']
    img = image.load_img(img_path, target_size=(150, 150))

    img_array = image.img_to_array(img).astype(float) / 255 #img_to_array: image -> numpy 배열 -- 이후 모든 px는 0~1 사이로 맞춰짐
    img_batch = np.expand_dims(img_array, axis=0) # expand_dims: 차원을 확장시키는 함수 axis=0 기준-- (150, 150) -> (1, 150, 150), 하는 이유는 batch 차원으로 들어와야 됨 

    #model = models.load_model('D:/dogs-vs-cats.hdf5')
    #prediction = model.predict(img_batch) #결과는 항상 2차원, batch size 포함
    #prediction = str(prediction.flatten()[0]) #flatten, 0번째 뽑아내면 값
    prediction = str(settings.MODEL.predict(img_batch).flatten()[0])
    
    print('prediction =>', prediction)
    
    data = {'result' : prediction} #data dic type 묶어줌
    
    return JsonResponse(data) #json객체로 return 해줌 -- RequestUtil.java 에서 뽑아서 text로 바뀌고 > FileTransferService에서 Double 타입으로 바뀌고 cat, dog분류