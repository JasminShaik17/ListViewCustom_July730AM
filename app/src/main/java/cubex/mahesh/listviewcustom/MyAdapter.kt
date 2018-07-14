package cubex.mahesh.listviewcustom

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import java.io.File

class MyAdapter : BaseAdapter()
{
    var files:Array<File>? = null
    var activity:MainActivity? = null
    constructor(files:Array<File>,activity: MainActivity)
    {
           this.files = files
            this.activity = activity
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

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