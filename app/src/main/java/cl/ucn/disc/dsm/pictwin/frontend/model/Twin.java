package cl.ucn.disc.dsm.pictwin.frontend.model;

import androidx.annotation.NonNull;
import lombok.*;

/**
 * The Twin of Pic
 *
 * @author Javiera Penna-Miranda
 */
public final class Twin {
    /**
     * The Id.
     */
    @Getter
    @Setter
    private Long id;

    /**
     * The dislike
     */
    @Getter
    @Setter
    private Boolean dislike = Boolean.FALSE;

    /**
     * The Pic
     */
    @Getter
    @Setter
    private Pic my;

    /**
     * The Pic
     */
    @Getter
    @Setter
    private Pic yours;


    /**
     * The owner
     */
    @Getter
    private User owner;


}
