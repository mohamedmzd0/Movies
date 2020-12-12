package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentMovieBinding
import retrofit2.Callback

class MovieFragment(position: Int) : Fragment() {


    lateinit var binding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val retrofitClient: RetrofitClient = RetrofitClient()
        val call: retrofit2.Call<MoviesModel> = retrofitClient.retrofit.getMovies();

        call.enqueue(object :Callback<MoviesModel>{
            override fun onFailure(call: retrofit2.Call<MoviesModel>, t: Throwable) {


            }

            override fun onResponse(
                call: retrofit2.Call<MoviesModel>,
                response: retrofit2.Response<MoviesModel>
            ) {
                binding.recycler.adapter = RecyclerAdapter(context,response.body()!!.results)

            }

        })

    }

}