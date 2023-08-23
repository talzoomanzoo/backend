from django.db import models
from django.utils.timezone import now
from django.contrib.auth.models import User
# Create your models here.
class Notice(models.Model): #models.Model을 상속 받음
    title=models.CharField(max_length=100)
    content=models.CharField(max_length=2000)
    write_date=models.DateTimeField(default=now, editable=False) #현재시각, 사용자가 edit 불가
    write_id=models.ForeignKey(User, on_delete=models.CASCADE)
    
    def __str__(self):
        return self.title #객체를 만들고 print(객체) 시 찍어줌
    
