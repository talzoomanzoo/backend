- 자바8 부터 java.util.function 패키지에 자주 사용되는 함수적 인터페이스를 표준 API로 제공
  제공되는 인터페이스는 아래와 같은 5가지
 - Consumer: 매개값은 있고 리턴값이 없음
 - Supplier: 매개값이 없고 리턴값이 있음
 - Function: 매개값, 리턴값 모두 있음(주로 매개값을 리턴값으로 매핑)
 - Operator: 매개값, 리턴값 모두 있음(주로 매개값을 연산하고 결과를 리턴)
 - Predicate: 매개값은 있고 리턴 타입은 boolean(매개값을 조사해서 true/false 리턴)