import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id;

    public BaseEntity() {}

    public BaseEntity(Long id) {
        this.id = id;
    }

    public static void foo() {
        System.out.println("BaseEntity#foo()!");
    }

    public Long getId() {
        return id;
    }

}
