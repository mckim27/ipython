//  이거슨 주석 !!
/*  요것도 주석 !! */
/*  여기도 주석 !! */
object MyModule{  // 단일 객체의 선언, 클래스와 클래스의 유일한 인스턴스를 동시에 선언한다... object는 java의 static이라고 생각하면 된다.
  def abs(n: Int): Int =  // abs는 정수 하나를 받고 정수를 돌려 주는 함수. ':' 는 결과 형식
    if(n < 0) -n  // 만일 n이 0보다 작으면 n의 부정(부호가 반대)을 리턴한다.
    else n        // n을 리턴
    
  private def formatAbs(x: Int) /*: String*/ = { // private 메서드로 이 모듈 안의 멤버들만 호출 가능.
    //  '=' 를 기준으로 좌변을 signature 우변을 definition          
    val msg = "The absolute value of %d is %d" // 수치를 위한 자리표 %d 가 두개 있는 문자열.
    msg.format(x, abs(x))  // 문자열의 두 %d 를 x와 abs(x) 로 치환하고 해당 문자열을 리턴. 스칼라 자체에서 반환형식을 추론 가능.
  }
  
def main(args: Array[String]) : Unit =  //Unit 는 Java나 C 같은 언어의 void와 같은 목적으로 쓰인다. 
    println(formatAbs(-42))
}


