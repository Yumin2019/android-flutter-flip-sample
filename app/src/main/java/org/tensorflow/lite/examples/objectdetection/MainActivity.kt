package org.tensorflow.lite.examples.objectdetection

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.coupleblog.MainActivityBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            lifecycleOwner = this@MainActivity
        }

        binding.button.setOnClickListener {
            val animator: ObjectAnimator = ObjectAnimator.ofFloat(binding.imageView, "rotationY", 0f, -360f)
            animator.duration = 2000
            animator.interpolator = AccelerateDecelerateInterpolator() // default
            animator.start()
        }
    }
}
