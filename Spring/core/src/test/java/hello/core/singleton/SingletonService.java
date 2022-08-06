/*
 * 싱글톤 패턴의 문제점
 * 1. 코드가 복잡해진다.
 * 2. 클라이언트가 구체 클래스에 의존해 DIP와 OCP를 위반한다.
 * 3. 테스트하기 어렵다.
 * 4. 내부 속성을 변경하거나 초기화하기 어렵다.
 * 5. private 생성자 때문에 자식 클래스를 만들기 어렵다.
 * 6. 유연성이 떨어진다.
 * 7. 안티패턴이라고도 불린다.
 *
 * => 스프링 컨테이너는 싱글톤 패턴의 문제를 해결하면서 객체 인스턴스를 싱클론으로 관리한다.
 */

package hello.core.singleton;

public class SingletonService {


    // 1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private로 선언해 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
