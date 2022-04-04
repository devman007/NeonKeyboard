package com.example.neonkeyboardnew

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.neonkeyboardnew.databinding.ExitButtonLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ExitButtonDialog : BottomSheetDialogFragment() {


    private lateinit var exitBottomSheetDialog: ExitButtonLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        exitBottomSheetDialog = ExitButtonLayoutBinding.inflate(inflater, container, false)
        return exitBottomSheetDialog.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        exitBottomSheetDialog.exitAppBtn.setOnClickListener {
            activity?.let {
                if (!it.isFinishing) {
                    dismiss()
                    (it as MainActivity).finish()

                }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(): ExitButtonDialog {
            return ExitButtonDialog()
        }
    }
}