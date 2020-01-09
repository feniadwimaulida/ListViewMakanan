package id.ac.poliban.fenia.listmakanan;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MakananAdapter extends BaseAdapter {
    private List<Makanan> data = new ArrayList<>();

    public MakananAdapter(List<Makanan> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_flag;
        TextView tvNamaMakanan;
        TextView tvDeskripsiMakanan;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_makanan, parent, false);

        img_flag = convertView.findViewById(R.id.img_flag);
        tvNamaMakanan = convertView.findViewById(R.id.tv_makanan_name);
        tvDeskripsiMakanan = convertView.findViewById(R.id.tv_Makanan_description);

        Glide.with(parent.getContext())
                .load(data.get(position).getFlag())
                .apply(new RequestOptions().override(60, 60))
                .into(img_flag);
        tvNamaMakanan.setText(data.get(position).getNamaMakanan());
        tvDeskripsiMakanan.setText(data.get(position).getDeskripsiMakanan());

        return convertView;
    }
}
