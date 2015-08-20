package org.zighinetto.qrkey.services;

import android.hardware.Camera;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import org.zighinetto.qrkey.R;

public class QrInputService extends InputMethodService implements SurfaceHolder.Callback, Camera.PreviewCallback {

    private SurfaceView cameraPreview;
    private SurfaceHolder cameraHolder;


    @Override
    public View onCreateInputView() {
        View kbw = getLayoutInflater().inflate(R.layout.ime, null);

        cameraPreview = (SurfaceView) kbw.findViewById(R.id.ime_camera_preview);
        cameraHolder = cameraPreview.getHolder();
        cameraHolder.addCallback(this);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB)
            //noinspection deprecation
            cameraHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

        return kbw;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void onPreviewFrame(byte[] data, Camera camera) {

    }
}
