package cl.ucn.disc.dsm.pictwin.frontend.model;

import androidx.annotation.NonNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The user of PicTwin
 *
 * @author Javiera Penna-Miranda
 */
public final class User {
    /**
     * The Id.
     */

    @Getter
    private Long id;

    /**
     * The email
     */
    @Getter
    @NonNull
    @Setter
    private String email;

    /**
     * The password
     */
    @Getter
    @Setter
    private String password;

    /**
     * The number of strikes
     */
    @Getter
    private Integer strikes;


    /**
     * The function increases the amount of strikes by one, whenever a pic breaks a rule or is
     * considered negatively.
     *
     * @return the number of strikes
     */
    public Integer incrementStrikes(){
        this.strikes++;
        return this.strikes;
    }


    /**
     * The state that a user can have
     */
    @Getter
    @Setter
    private State state = State.ACTIVE;


    /**
     * The Twins
     */
    @Getter
    private List<Twin> twins = new ArrayList<>();

    /**
     * Insert a Twin in the list
     * @param twin to add
     */
    public void add(final Twin twin){

        this.twins.add(twin);
    }

}
