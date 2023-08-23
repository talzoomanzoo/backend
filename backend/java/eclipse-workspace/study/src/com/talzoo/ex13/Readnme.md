운영체제
-프로세스에 자원 할당
-여러개의 프로세스 동시에 작동 가능: multiprocessing 지원
-프로세스는 서로 독립된 resource 사용하기 때문에 서로 통신이 필요할 때가 있다
 eg. 복붙, 탐색기에 끌어넣기
 -프로세스 간 통신에는 IPC(Inter Process Communication) 이용 필요

-하나의 프로세스 내에서 어떤 작업을 동시에 할 수는 없을까?
 -특정 동작을 나눠서 동시에 하자: thread
 -쪼갰다가 합치기

-quad core: 물리적인 cpu 칩 안에 core가 네개
-octa core: core가 8개
-quad core: thread 네개로 최대 나누면 각각 core가 thread 하나씩 작업 가능 (병렬 computing)
 -4개 이상의 thread면 어떻게 할까?
  core마다 다른 개수로 -> time sharing 기법으로 나눔 이때 메모리 상태를 어디에다 저장했다가 다시 불러와야 함 context switching
  -cpu 입장에서 context switching은 부담스러운 작업, 게다가 time sharing 기법이 같은 시간 ㄴㄴ, 우선순위에 따라 시간 할당이 다름
  -그래서 청기백기를 돌려도 일정하게 안나옴, 특히 cpu가 바쁠 때는 더 그럼

-왜 thread 가 필요한가?
-자바에서는 어떤 문법이 필요한가 thread 구현하기 위해서는