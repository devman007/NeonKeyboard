package com.example.neonkeyboardnew

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import androidx.fragment.app.DialogFragment
import com.example.neonkeyboardnew.apputils.rateUs
import com.example.neonkeyboardnew.databinding.RateusDialogLayoutBinding
import keyboard.neon.newboard.util.showToast


class RatingDialog : DialogFragment() {

    private var isRating = false
    private lateinit var rateUsDialogLayoutBinding: RateusDialogLayoutBinding


    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 0.90).toInt()
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        rateUsDialogLayoutBinding = RateusDialogLayoutBinding.inflate(inflater, container, false)

        with(rateUsDialogLayoutBinding)
        {

            mayBeLaterBtn.setOnClickListener {

                dismiss()
            }

            ratingBar.onRatingBarChangeListener =
                RatingBar.OnRatingBarChangeListener { _, rating, _ ->
                    isRating = rating.toInt() > 3
                    if (isRating)
                        rateUs(requireContext())
                    else
                        requireContext().showToast("Thanks for rating us.")
                    dismiss()
                }
        }

        return rateUsDialogLayoutBinding.root
    }


}



