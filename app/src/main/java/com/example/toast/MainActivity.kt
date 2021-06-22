package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toast.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMensajeToast.setOnClickListener {
            MotionToast.createToast(
                this,
                "Operacion Exitosa",
            "Mensaje enviado correctamente",
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION,
                null
            )
        }

        binding.btnConexionToast.setOnClickListener {
            MotionToast.createToast(
                this,
                "Fallo la conexion",
                "Error grave",
                MotionToast.TOAST_ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                null
            )
        }

        binding.btnInfoToast.setOnClickListener {
            MotionToast.createToast(
                this,
                "Informacion incompleta",
                "Complete los campos obligatorios",
                MotionToast.TOAST_WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                null
            )
        }

        binding.btnEliminarToast.setOnClickListener {
            MotionToast.createToast(
                this,
                "Informacion Eliminada",
                "Datos borrados correctamente",
                MotionToast.TOAST_DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                null
            )
        }
    }
}