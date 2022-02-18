package id.example.simplebottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalBottomSheet: BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val field = view.findViewById<EditText>(R.id.field)
        val bottomSheetResult = view.findViewById<TextView>(R.id.bottomSheetResult)
        val submit = view.findViewById<Button>(R.id.submit)

        // interaksi disini
        submit.setOnClickListener {
            bottomSheetResult.text = field.text.toString()
        }
    }
}