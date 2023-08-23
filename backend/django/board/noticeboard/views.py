from django.shortcuts import render, redirect,get_object_or_404 #사용자에게 view를 rendering
from .models import Notice
from django.urls import reverse
from django.utils import timezone
from django.contrib.auth.decorators import login_required
# Create your views here.
def index(request):
    article_list=Notice.objects.all().order_by('-write_date') #-: descending
    context={'article_list': article_list}
    return render(request, 'noticeboard/index.html', context) #1: request, 2: html, 3: 같이 실어줄 data

def write_article(request):
    return render(request, 'noticeboard/write_article.html')

@login_required(login_url='common:login') #common의 login으로 redirect
def add_article(request):
    notice=Notice()
    notice.title=request.POST['i_title']
    notice.content=request.POST['i_content']
    notice.write_id= request.user
    notice.save()
    
    return redirect(reverse('noticeboard:index'))

def view_article(request, article_id):
    notice=get_object_or_404(Notice, pk=article_id) #pk의 article_id있으면 넣어주고 없으면 view에 없다고 뿌려줌
    return render(request, 'noticeboard/detail.html', {'article': notice})

def update_article(request, article_id):
    notice=Notice.objects.get(id=article_id) #get한 이유는 이미 있는 것을 하니까
    
    if request.method=='POST':
        notice.title=request.POST['title']
        notice.content=request.POST['content']
        notice.write_date=timezone.datetime.now()
        notice.save()
        return redirect(reverse('noticeboard:view', args=(article_id,)))
    else:
        return render(request, 'noticeboard/detail.html', {'article': notice})
    
def delete_article(request, article_id):
    notice=Notice.objects.get(id=article_id)
    notice.delete()
    return redirect(reverse('noticeboard:index'))