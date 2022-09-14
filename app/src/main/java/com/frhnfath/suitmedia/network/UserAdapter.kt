package com.frhnfath.suitmedia.network

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frhnfath.suitmedia.R
import com.frhnfath.suitmedia.activities.SecondActivity
import com.frhnfath.suitmedia.data.DataItem
import com.frhnfath.suitmedia.databinding.UserItemBinding

class UserAdapter(private val listUser: List<String>): RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(private val binding: UserItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(user: DataItem) {
            with(binding) {
                Glide.with(ivUser).load(user.avatar).into(ivUser)
                tvFirstname.text = user.firstName
                tvLastname.text = user.lastName
                tvEmail.text = user.email
                itemView.setOnClickListener {
                    onClick(user)
                }
            }
        }
        private fun onClick(description: DataItem) {
            val user = UserModel(description.firstName, description.lastName, description.email, description.avatar)
            Toast.makeText(itemView.context, "You Chose " + user.firstname, Toast.LENGTH_SHORT).show()
            val intent = Intent(itemView.context, SecondActivity::class.java)
            intent.putExtra(SecondActivity.EXTRA_USER, user)
            itemView.context.startActivity(intent)
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        listUser.size
    }
}