package com.example.rxjava2_retrofit2_mvp.ui.index.model;

import java.util.List;

/**
 * create by 厦门最有料信息科技有限公司
 * on 2020/5/14
 */
public class PicListBean {


    /**
     * code : 200
     * message : 成功!
     * result : [{"id":591,"time":"2018-09-18 17:52:43","img":"http://ww4.sinaimg.cn/large/610dc034gw1euxdmjl7j7j20r2180wts.jpg"},{"id":592,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/7a8aed7bgw1eutscfcqtcj20dw0i0q4l.jpg"},{"id":593,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/7a8aed7bgw1eutsd0pgiwj20go0p0djn.jpg"},{"id":594,"time":"2018-09-18 17:52:43","img":"http://ww4.sinaimg.cn/large/7a8aed7bgw1eusn3niy2bj20hs0qo0wb.jpg"},{"id":595,"time":"2018-09-18 17:52:43","img":"http://ww1.sinaimg.cn/large/7a8aed7bgw1euqcfwjbkdj20hs0qo40w.jpg"},{"id":596,"time":"2018-09-18 17:52:43","img":"http://ww4.sinaimg.cn/large/7a8aed7bgw1eurhwfc5z7j20hs0qomzz.jpg"},{"id":597,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/7a8aed7bgw1eup75gxp8qj20hr0qoae8.jpg"},{"id":598,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/7a8aed7bgw1eukj6vosygj20gs0p0act.jpg"},{"id":599,"time":"2018-09-18 17:52:43","img":"http://ww4.sinaimg.cn/large/7a8aed7bgw1eujhfwyj27j20qo0hs0vy.jpg"},{"id":600,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/610dc034gw1eujhf1599jj20dt0kuwhi.jpg"},{"id":601,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/7a8aed7bgw1eui8h92qyaj20p111idmw.jpg"},{"id":602,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/7a8aed7bgw1euh2zyekn2j20hs0qodje.jpg"},{"id":603,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/7a8aed7bgw1eudm5ktieij20ey0midhq.jpg"},{"id":604,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/7a8aed7bjw1eucg4wdq8ij20m80m8q6s.jpg"},{"id":605,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/610dc034gw1eubet6h43qj20qo0hsadh.jpg"},{"id":606,"time":"2018-09-18 17:52:43","img":"http://ww1.sinaimg.cn/large/7a8aed7bgw1eua4mbsim0j20hs0qojuh.jpg"},{"id":607,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/7a8aed7bgw1eu8zauvndoj20go0gpdik.jpg"},{"id":608,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/7a8aed7bgw1eu5jpf3lamj20f00mitck.jpg"},{"id":609,"time":"2018-09-18 17:52:43","img":"http://ww2.sinaimg.cn/large/7a8aed7bgw1eu4cwbv2a6j20zk0qo7dw.jpg"},{"id":610,"time":"2018-09-18 17:52:43","img":"http://ww3.sinaimg.cn/large/610dc034gw1eu3bld296jj20df0kudhx.jpg"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 591
         * time : 2018-09-18 17:52:43
         * img : http://ww4.sinaimg.cn/large/610dc034gw1euxdmjl7j7j20r2180wts.jpg
         */

        private int id;
        private String time;
        private String img;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }
    }
}
