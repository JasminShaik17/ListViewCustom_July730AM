package cubex.mahesh.listviewcustom

import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.indiview.view.*
import java.io.File

class MyAdapter : BaseAdapter
{
    var files:Array<File>? = null
    var activity:MainActivity? = null
    constructor(files:Array<File>,activity: MainActivity)
    {
           this.files = files
            this.activity = activity
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

   var inflater = LayoutInflater.from(activity)
   var v = inflater.inflate(R.layout.indiview,null)

       var file = files!![p0]
       // v.iv1.setImageURI(Uri.fromFile(file))
        var b = BitmapFactory.decodeFile(file.path)
       var bmp = ThumbnailUtils.extractThumbnail(b,50,50)
        v.iv1.setImageBitmap(bmp)
        v.tv1.text = file.name
        v.tv2.text = file.length().toString()
        v.b1.setOnClickListener({
            file.delete()
            activity!!.readFiles()
        })

        return  v
    }

    override fun getItem(p0: Int): Any {
        return  0;
    }

    override fun getItemId(p0: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return files!!.size
    }

}