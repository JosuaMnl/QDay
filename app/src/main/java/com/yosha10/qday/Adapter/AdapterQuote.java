package com.yosha10.qday.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yosha10.qday.Model.QuoteModel;
import com.yosha10.qday.R; // Import R karena struktur folder sudah berubah agar bisa memanggil id

import java.util.ArrayList;
import java.util.List;

public class AdapterQuote extends RecyclerView.Adapter<AdapterQuote.ViewHolderQuote> {
    private List<QuoteModel> listQuote = new ArrayList<>();
    private Context ctx; // Context mewakili class non activity

    public AdapterQuote(List<QuoteModel> listQuote, Context ctx) {
        this.listQuote = listQuote;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolderQuote onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.item_quote, parent, false);
        return new ViewHolderQuote(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderQuote holder, int position) {
        QuoteModel quoteModel = listQuote.get(position);
        holder.tvText.setText(quoteModel.getText());
        holder.tvAuthor.setText(quoteModel.getAuthor());
    }

    @Override
    public int getItemCount() {
        return listQuote.size();
    }

    public class ViewHolderQuote extends RecyclerView.ViewHolder{
        TextView tvText, tvAuthor;
        public ViewHolderQuote(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tv_text);
            tvAuthor = itemView.findViewById(R.id.tv_author);
        }
    }
}
