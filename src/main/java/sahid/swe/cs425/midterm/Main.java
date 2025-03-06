package sahid.swe.cs425.midterm;

import model.Patient;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        var patients= List.of(
                new Patient(101,"Sahid","Hossain","(123) 45671247","soaps@sahid.com","MO","12-05-1992"),
                new Patient(101,"hasnat","karim","(123) 8797874","soaps@hasnat.com","IA","12-05-1998"),
                new Patient(101,"abdul","haikm","(123) 45677896","soaps@hakim.com","NY","12-05-1995")
        );
        patients.forEach(System.out::println);
    }
}
