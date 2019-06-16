package dao;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotoItemDao {
    @SerializedName("link") private String link;
    @SerializedName("id") private int id;

    @SerializedName("image_url")        private String imageUrl;
    @SerializedName("caption")          private String caption;
    @SerializedName("user_id")          private int userId;
    @SerializedName("username")         private String userName;
    @SerializedName("profile_picture")  private String profilePicture;
    @SerializedName("tags")             private List<String> tags = new ArrayList<>();
    @SerializedName("created_time")     private Date createTime;
    @SerializedName("camera")           private String camera;
    @SerializedName("lens")             private String lens;
    @SerializedName("focal_length")     private String focalLenght;
    @SerializedName("iso")              private String iso;
    @SerializedName("shutter_speed")    private String stutterSpeed;
    @SerializedName("aperture")         private String aperture;


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getFocalLenght() {
        return focalLenght;
    }

    public void setFocalLenght(String focalLenght) {
        this.focalLenght = focalLenght;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getStutterSpeed() {
        return stutterSpeed;
    }

    public void setStutterSpeed(String stutterSpeed) {
        this.stutterSpeed = stutterSpeed;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }
}
