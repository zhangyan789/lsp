package com.wulianwang.lsp.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import android.widget.ImageButton;
import android.widget.ImageView;

import com.wulianwang.lsp.R;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;


public class GerenrenZheng extends AppCompatActivity {
    static final int TAKE_PHOTO=1;
    ImageView  picture;
    Uri imageUri1,imageUri2,imageUri3;
    ImageButton imbt1,imbt2,imbt3,imbtbak;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imbt1 =(ImageButton)findViewById(R.id.imageButton);
        imbt2 =(ImageButton)findViewById(R.id.imageButton2);
        imbt3 =(ImageButton)findViewById(R.id.imageButton3);
        imbtbak=(ImageButton)findViewById(R.id.imageButton6);


        imbtbak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=1;
                File outputImage = new File(getExternalCacheDir(), "output_image1.jpg");
                try//判断图片是否存在，存在则删除在创建，不存在则直接创建
                {
                    if (outputImage.exists()) {
                        outputImage.delete();
                    }
                    outputImage.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (Build.VERSION.SDK_INT >= 24)
                {    imageUri1 = FileProvider.getUriForFile(GerenrenZheng.this,
                        "com.example.cameraalbumtest.fileprovider", outputImage);
                }
                else{
                    imageUri1=Uri.fromFile(outputImage);
                }
                Intent intent=new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri1);

                startActivityForResult(intent,TAKE_PHOTO);

            }
        });


        imbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=2;
                File outputImage = new File(getExternalCacheDir(), "output_image2.jpg");
                try//判断图片是否存在，存在则删除在创建，不存在则直接创建
                {
                    if (outputImage.exists()) {
                        outputImage.delete();
                    }
                    outputImage.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (Build.VERSION.SDK_INT >= 24)
                {    imageUri2= FileProvider.getUriForFile(GerenrenZheng.this,
                        "com.example.cameraalbumtest.fileprovider", outputImage);
                }
                else{
                    imageUri2=Uri.fromFile(outputImage);
                }
                Intent intent=new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri2);
                startActivityForResult(intent,TAKE_PHOTO);

            }
        });


        imbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=3;
                File outputImage = new File(getExternalCacheDir(), "output_image3.jpg");
                try//判断图片是否存在，存在则删除在创建，不存在则直接创建
                {
                    if (outputImage.exists()) {
                        outputImage.delete();
                    }
                    outputImage.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (Build.VERSION.SDK_INT >= 24)
                {    imageUri3 = FileProvider.getUriForFile(GerenrenZheng.this,
                        "com.example.cameraalbumtest.fileprovider", outputImage);
                }
                else{
                    imageUri3=Uri.fromFile(outputImage);
                }
                Intent intent=new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra(MediaStore.EXTRA_OUTPUT,imageUri3);
                startActivityForResult(intent,TAKE_PHOTO);

            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode)
        {
            case TAKE_PHOTO:
                if(resultCode==RESULT_OK)
                {
                    try {
                        switch (i){
                            case 1:
                                Bitmap bitmap1= BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri1));
                                imbt1.setBackground(new BitmapDrawable(bitmap1));
                                break;
                            case 2:
                                Bitmap bitmap2= BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri2));
                                imbt2.setBackground(new BitmapDrawable(bitmap2));
                                break;
                            case 3:
                                Bitmap bitmap3= BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri3));
                                imbt3.setBackground(new BitmapDrawable(bitmap3));
                                break;
                        }
                    }
                    catch (FileNotFoundException e)
                    {
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
        }
    }
}
