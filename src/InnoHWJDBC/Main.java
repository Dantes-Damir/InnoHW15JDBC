package InnoHWJDBC;

import InnoHWJDBC.dao.CityDaoImpl;
import InnoHWJDBC.dao.StudentDao;
import InnoHWJDBC.dao.StudentDaoImpl;
import InnoHWJDBC.pojo.City;
import InnoHWJDBC.pojo.Student;

public class Main {
    public static void main(String[] args) {
        CityDaoImpl cityDao = new CityDaoImpl();
        City city = new City(1, "Moskow", 123);

        Student student = new Student(1, "Вася", "Петров", 23, "qwrtert@mail.ru", city);
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.addStudent(student);
    }
}
