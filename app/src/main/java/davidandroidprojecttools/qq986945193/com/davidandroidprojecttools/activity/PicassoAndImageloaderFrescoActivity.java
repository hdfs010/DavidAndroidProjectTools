package davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.R;
import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.constant.Urls;
import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.utils.GlideAndFrescoUtils;
import davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.utils.PicassoWithImageLoaderImageViewUtils;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @交流Qq ：986945193
 */

/**
 * 显示图片的Picasso,UniversalImageloader,Fresco的使用教程
 */
public class PicassoAndImageloaderFrescoActivity extends Activity {
    private Button btn_picasso_img;
    private Button btn_imageloader_img;
    private Button btn_fresco_img;
    private Button btn_glide_img;
    private ImageView iv_picasso_fresco_glide_imageloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_imageloader_fresco);
        initView();
        setOnclickListener();
    }


    private void setOnclickListener() {
        /**
         * Picasso显示图片
         */
        btn_picasso_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PicassoWithImageLoaderImageViewUtils.withImageView(PicassoAndImageloaderFrescoActivity.this,
                        Urls.GET_IMAGE_URL, iv_picasso_fresco_glide_imageloader);
            }
        });
        /**
         * UniversalImageloader显示图片
         */
        btn_imageloader_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PicassoWithImageLoaderImageViewUtils.displayImage(Urls.GET_IMAGE_URL_IMAGELOADER, iv_picasso_fresco_glide_imageloader);
            }
        });
        /**
         * Glide显示图片
         */

        btn_glide_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlideAndFrescoUtils.withImageView(PicassoAndImageloaderFrescoActivity.this,
                        Urls.GET_IMAGE_URL_GLIDE, iv_picasso_fresco_glide_imageloader);
            }
        });

    }

    private void initView() {
        btn_picasso_img = (Button) findViewById(R.id.btn_picasso_img);
        btn_imageloader_img = (Button) findViewById(R.id.btn_imageloader_img);
        btn_fresco_img = (Button) findViewById(R.id.btn_fresco_img);
        btn_glide_img = (Button) findViewById(R.id.btn_glide_img);
        iv_picasso_fresco_glide_imageloader = (ImageView) findViewById(R.id.iv_picasso_fresco_glide_imageloader);


    }
}