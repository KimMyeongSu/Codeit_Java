import java.util.Scanner;

/**
* Created by Administrator on 2017-07-18.
*/
    public class codeit_Introduction {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in); //입력을 받기위한 스캐너 객체 생성

                while (true) { //메인메뉴 반복을 위한 무한루프

                    System.out.println("(I)ntro (C)ourses (E)xit"); //메인메뉴 출력
                    String input = scanner.next();//메인메뉴 선택을위한 입력변수 input을 입력받음.
                    switch (input) {  //입력 받은  input 문자열을 확인하여 switch-case 구문으로 출력문구을 찾아서 출력.

                        case "I": //대소문자 구분을 안두기 위해 break는 한번만 사용.
                        case "i":
                            System.out.print("안녕하세요! 우리는 코드잇입니다.\n" +
                                    "함께 공부합시다!\n");
                            break;

                        case "C":
                        case "c":
                            System.out.println("코드잇 수업을 소개합니다.");
                            while (true) { //
                                System.out.println("(P)ython (J)ava (i)OS (B)ack"); //수업메뉴 출력.
                                String input_courses = scanner.next(); //수업선택을 위한 문자열변수
                                switch (input_courses) {
                                    case "p":
                                    case "P":
                                        System.out.print("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                                "강사: 강영훈\n" +
                                                "추천 선수과목: 없음\n");break;

                                    case "j":
                                    case "J":
                                        System.out.print("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                                "강사: 김신의\n" +
                                                "추천 선수과목: Python\n");break;

                                    case "i":
                                    case "I":
                                        System.out.print("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                                "강사: 성태호\n" +
                                                "추천 선수과목: Python, Java\n");break;
                                }

                                if (input_courses.equals("b") || input_courses.equals("B")) { //문자열을 비교하여 b or B 인경우 다시 밖쪽 메뉴 루프로 탈출
                                    break;
                                }
                            }
                      /*
                        default:
                            System.out.println("메뉴를 다시확인하세요.");
                     */
                        }

                    if (input.equals("e") || input.equals("E")) { //문자열을 비교하여 e or E 인경우 출력후 루프 탈출 종료.
                        System.out.println("안녕히 가세요.");
                        break;
                    }
                }
            }
    }