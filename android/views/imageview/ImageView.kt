import android.widget.ImageView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

/** @see <a href="https://github.com/bumptech/glide">Glide</a> */
fun ImageView.glide(url: String) {
    Glide.with(this).load(url).into(this)
}

/** @see <a href="https://github.com/square/picasso">Picasso</a> */
fun ImageView.picasso(url: String) {
    Picasso.get().load(url).into(this)
}