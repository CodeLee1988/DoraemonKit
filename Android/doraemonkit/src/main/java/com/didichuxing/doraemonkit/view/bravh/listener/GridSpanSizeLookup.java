package com.didichuxing.doraemonkit.view.bravh.listener;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;

/**
 * @author: limuyang
 *  2019-12-03
 * @Description:
 */
public interface GridSpanSizeLookup {

    int getSpanSize(@NonNull GridLayoutManager gridLayoutManager, int viewType, int position);
}
