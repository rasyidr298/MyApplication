package id.fp.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.fp.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.let {
            it.btnLogin.setOnClickListener {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }

            it.tvForgot.setOnClickListener {
                startActivity(Intent(this, RecoverAccountActivity::class.java))
            }

            it.tvRegister.setOnClickListener {
                startActivity(Intent(this, RegisterActivity::class.java))
            }
        }

    }
}