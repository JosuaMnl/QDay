package com.yosha10.qday.API;

import com.yosha10.qday.Model.QuoteModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("quotes") // Mengambil alamat link
    Call<List<QuoteModel>> ardRetrieve(); // Memanggil API
}
