package com.app.yjzlibs.baselib.bean.find.repair;

/**
 * Created by yujinzhao on 18/4/27.
 */

public class RepairStatusBean {

    public static final int DAI_CHU_LI =1;
    public static final int CHU_LI_ZHONG =2;
    public static final int YI_CHU_LI =3;
    public static final int WAN_CHENG =4;

    public long getReturn_code() {
        return return_code;
    }

    public void setReturn_code(long return_code) {
        this.return_code = return_code;
    }

    /**
     * repair_id : 8
     * farm_id : 1
     * user_id : 2
     * repair_type : 1
     * repair_type_name : 水泵故障
     * repair_content : 必须经济学家
     * repair_imgs : https%3A%2F%2Fcdn1.greenhn.cn%2Fganlin%2Fupload%2Frepair%2F1526557127K4h.jpg%3Bhttps%3A%2F%2Fcdn1.greenhn.cn%2Fganlin%2Fupload%2Frepair%2F1526557127201.png%3Bhttps%3A%2F%2Fcdn1.greenhn.cn%2Fganlin%2Fupload%2Frepair%2F1526557127tJn.png
     * repair_time : 1526557129
     * expected_time : 1135008000000
     * contact_phone : 15197282256
     * contact_name : null
     * dealer_name :
     * dealer_phone :
     * dealer_time :
     * dealer_user :
     * dealer_content :
     * dealer_imgs :
     * comment_time : 0
     * comment_content :
     * comment_count : 0
     * repair_state : 1
     */

    private long return_code;
    private long repair_id;
    private long farm_id;
    private long user_id;
    private int repair_type;
    private String repair_type_name;
    private String repair_content;
    private String repair_imgs;
    private long repair_time;
    private long expected_time;
    private String contact_phone;
    private String contact_name;
    private String dealer_name;
    private String dealer_phone;
    private long dealer_time;
    private String dealer_user;
    private String dealer_content;
    private String dealer_imgs;
    private long comment_time;
    private String comment_content;
    private int comment_count;
    private int repair_state;//1待处理 2处理中 3已处理待评价 4处理完成

    public long getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(long repair_id) {
        this.repair_id = repair_id;
    }

    public long getFarm_id() {
        return farm_id;
    }

    public void setFarm_id(long farm_id) {
        this.farm_id = farm_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getRepair_type() {
        return repair_type;
    }

    public void setRepair_type(int repair_type) {
        this.repair_type = repair_type;
    }

    public String getRepair_type_name() {
        return repair_type_name;
    }

    public void setRepair_type_name(String repair_type_name) {
        this.repair_type_name = repair_type_name;
    }

    public String getRepair_content() {
        return repair_content;
    }

    public void setRepair_content(String repair_content) {
        this.repair_content = repair_content;
    }

    public String getRepair_imgs() {
        return repair_imgs;
    }

    public void setRepair_imgs(String repair_imgs) {
        this.repair_imgs = repair_imgs;
    }

    public long getRepair_time() {
        return repair_time;
    }

    public void setRepair_time(long repair_time) {
        this.repair_time = repair_time;
    }

    public long getExpected_time() {
        return expected_time;
    }

    public void setExpected_time(long expected_time) {
        this.expected_time = expected_time;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getDealer_name() {
        return dealer_name;
    }

    public void setDealer_name(String dealer_name) {
        this.dealer_name = dealer_name;
    }

    public String getDealer_phone() {
        return dealer_phone;
    }

    public void setDealer_phone(String dealer_phone) {
        this.dealer_phone = dealer_phone;
    }

    public long getDealer_time() {
        return dealer_time;
    }

    public void setDealer_time(long dealer_time) {
        this.dealer_time = dealer_time;
    }

    public String getDealer_user() {
        return dealer_user;
    }

    public void setDealer_user(String dealer_user) {
        this.dealer_user = dealer_user;
    }

    public String getDealer_content() {
        return dealer_content;
    }

    public void setDealer_content(String dealer_content) {
        this.dealer_content = dealer_content;
    }

    public String getDealer_imgs() {
        return dealer_imgs;
    }

    public void setDealer_imgs(String dealer_imgs) {
        this.dealer_imgs = dealer_imgs;
    }

    public long getComment_time() {
        return comment_time;
    }

    public void setComment_time(long comment_time) {
        this.comment_time = comment_time;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public int getRepair_state() {
        return repair_state;
    }

    public void setRepair_state(int repair_state) {
        this.repair_state = repair_state;
    }
}
