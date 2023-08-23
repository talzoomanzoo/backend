from django.contrib import admin
from noticeboard.models import Notice
# Register your models here.
admin.site.register(Notice) #admin 페이지에서 model을 접근할 수 있게 해주는 작업