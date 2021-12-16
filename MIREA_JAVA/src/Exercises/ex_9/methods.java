package Exercises.ex_9;

public interface methods {
    Person search_by_name(String name) throws database.StudentNotFoundExeption, EmptyStringExeption;
    Boolean search(Person key)  throws database.StudentNotFoundExeption;

}
