package ravikumar.sujatha.domain;

/**
 * Created by sujatharavikumar on 11/2/16.
 */
public class Payment {

    private Long id;
    private Short amount;

    public Payment (Long id, Short amount) {
        this.id = id;
        this.amount = amount;
    }

    public Payment () {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public Long getId() {

        return id;
    }

    public Short getAmount() {
        return amount;
    }
}
