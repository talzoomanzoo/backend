from django.urls import path
from django.contrib.auth import views as auth_views
from . import views

app_name='common'

urlpatterns = [
    path('login/', auth_views.LoginView.as_view(), name='login'), #LoginView -- django.contrib.auth에서 default 제공 즉 view (MVC- controller 자동 생성), registration folder 아래 login.html 찾게끔 기본 설정이 되어있음 LoginView가
    path('logout/', auth_views.LogoutView.as_view(), name='logout'),
    path('signup/', views.signup, name='signup'),
] #URL Conf (URL 환경설정) -- URL로 어떤 것을 해야할 지 mapping 시켜 놓는 것