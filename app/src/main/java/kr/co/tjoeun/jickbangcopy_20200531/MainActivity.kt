package kr.co.tjoeun.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.jickbangcopy_20200531.adapters.RoomAdapter
import kr.co.tjoeun.jickbangcopy_20200531.datas.Room

class MainActivity : BaseActivity() {

    lateinit var roomAdapter : RoomAdapter
    val rooms = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        rooms.add(Room(8000, "마포구 서교동", 1, "마포 서교동의 방입니다."))
        rooms.add(Room(28000, "마포구 서교동", 3, "마포 서교동의 방입니다."))
        rooms.add(Room(35000, "마포구 서교동", 5, "마포 서교동의 방입니다."))
        rooms.add(Room(17000, "마포구 서교동", 4, "마포 서교동의 방입니다."))
        rooms.add(Room(6000, "마포구 성산동", 0, "마포 성산동의 방입니다."))
        rooms.add(Room(4000, "마포구 성산동", 1, "마포 성산동의 방입니다."))
        rooms.add(Room(45000, "마포구 성산동", 0, "마포 성산동의 방입니다."))
        rooms.add(Room(18000, "마포구 망원동", -1, "마포 망원동의 방입니다."))
        rooms.add(Room(23000, "마포구 망원동", -1, "마포 망원동의 방입니다."))
        rooms.add(Room(15000, "마포구 망원동", 2, "마포 망원동의 방입니다."))
        rooms.add(Room(7000, "마포구 망원동", 3, "마포 망원동의 방입니다."))

        roomAdapter = RoomAdapter(mContext, R.layout.room_list_item, rooms)
        roomListView.adapter = roomAdapter

    }

}
