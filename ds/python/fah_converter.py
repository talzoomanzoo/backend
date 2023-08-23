def convert_to_f(celsius_value):
	return celsius_value * 9.0 / 5 + 32

    
if __name__ == "__main__": #__name__ 모듈의 이름을 담고 있는 파이썬 내장 변수, #__main__ 최상위 코드가 실행되는 환경의 이름 (프로그램 실행 시 첫번째론 실행되는 python 모듈)
    print("모듈 테스트")
    print(convert_to_f(10))
    
    
if __name__ != "__main__":
    print(__name__)