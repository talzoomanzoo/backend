from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login
from common.forms import UserForm
# Create your views here.
def signup(request):
    if request.method == "POST":
        form = UserForm(request.POST)
        if form.is_valid():
            form.save()
            username = form.cleaned_data.get('username')
            raw_password = form.cleaned_data.get('password1')
            user = authenticate(username=username, password=raw_password)  # 사용자 인증
            login(request, user)  # 로그인
            return redirect('/board/')
    else: #post 방식이 아니면, 계정, password signup 다시 띄워줌
        form = UserForm()
    return render(request, 'registration/signup.html', {'form': form})