package tech.michaeloverman.draganddraw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by overm on 7/26/2016.
 */
public class DragAndDrawFragment extends android.support.v4.app.Fragment {

    public static DragAndDrawFragment newInstance() {
        return new DragAndDrawFragment();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drag_and_draw, container, false);
        return v;
    }
}
