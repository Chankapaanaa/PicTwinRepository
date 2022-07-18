package cl.ucn.disc.dsm.pictwin.frontend.model;

import lombok.*;
import androidx.annotation.NonNull;
import java.time.ZonedDateTime;

/**
 * The Picture Image.
 *
 * @author Javiera Penna-Miranda
 */
public final class Pic {
    /**
     * The Id.
     */
    @Getter
    @Setter
    private Long id;

    /**
     * The instant when the Pic was saved.
     */
    @Getter
    private ZonedDateTime timestamp = ZonedDateTime.now();

    /**
     * The amount of dislike the pic has
     */
    @Getter
    @Builder.Default
    private Integer dislikes = 0;

    /**
     * The exact number of the latitude.
     */
    @Getter
    private Double latitude;

    /**
     * The exact number of the longitude.
     */
    @Getter
    private Double longitude;

    /**
     * Number representing the error of the coordinates of the user.
     */
    @Getter
    private Double error;

    /**
     * The amount of views a pic has.
     */
    @Getter
    private Integer views = 0;

    /**
     * The title corresponding to the pic.
     */
    @Getter
    @Setter
    private String name;

    /**
     * The corresponding bytes to the pic.
     */
    @Getter
    private byte[] picture;

    /**
     * The owner
     */
    @Getter
    @Setter
    private User owner;

    /**
     * The function increases the amount of dislikes whenever someone dislikes the pic.
     * @return dislikes number
     */
    public Integer incrementDislikes(){
        this.dislikes++;
        return this.dislikes;
    }

    /**
     * The function increases the amount of views whenever someone views the pic.
     * @return views number
     */
    public Integer incrementViews(){
        this.views++;
        return this.views;
    }

}
