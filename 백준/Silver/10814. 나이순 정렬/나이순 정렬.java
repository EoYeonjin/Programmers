import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Member> members = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members.add(new Member(age, name));            
        }

        members.sort(new Comparator<Member>(){
            @Override
            public int compare(Member m1, Member m2){
                return Integer.compare(m1.age, m2.age);
            }
        });

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }

    static class Member{
        int age;
        String name;

        public Member(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
}