package net.ivanvega.minavegacionuiux.ui.gallery;

import android.net.wifi.aware.PublishConfig;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> urlPic;

    public MutableLiveData<String> getUrlPic() {
        return urlPic;
    }

    public void setUrlPicRandom() {
        this.urlPic.setValue(this.getUrlRandomPic());
    }

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");

         urlPic = new MutableLiveData<>();
         urlPic.setValue(this.getUrlRandomPic());
    }

    public LiveData<String> getText() {
        return mText;
    }

    private String getUrlRandomPic(){
        return  "https://picsum.photos/"  + (int)(Math.random()*5+3) + "00/" + (int)(Math.random()*5+3) + "00";
    }

    public String getRandomPic(){
        return this.getUrlRandomPic();
    }
}