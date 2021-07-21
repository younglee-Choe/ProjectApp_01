package org.techtown.priceofcafe;

import android.view.View;

public interface OnCafeItemClickListener {
    public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position);
}
