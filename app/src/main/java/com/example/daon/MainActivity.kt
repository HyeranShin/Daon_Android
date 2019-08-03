package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var nameList: ArrayList<Name> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        insertNameListData()

//        nameList[Random().nextInt(nameList.size)].name
    }

    private fun insertNameListData() {
        nameList.add(Name("가온", "Gaon", "세상의 중심이 되어라", "Be the center of the world"))
        nameList.add(Name("나린", "Narin", "하늘이 내린", "The person with the sky"))
        nameList.add(Name("나래", "Narae", "날개", "The wings"))
        nameList.add(Name("나예", "Naye", "나비처럼 예쁘게", "Pretty as a butterfly"))
        nameList.add(Name("너울", "Neoul", "바다의 큰 물결", "The big wave of the sea"))
        nameList.add(Name("다솜", "Dasom", "애틋한 사람", "The person who is dear, pitiful and affectionate"))
        nameList.add(Name("다원", "Dawon", "모두가 다 사랑하는 사람", "The person everyone loves"))
        nameList.add(Name("다온", "Daon", "좋은 모든 일들이 다 오는", "All good things come"))
        nameList.add(Name("다올", "Daol", "하는 일마다 복이 옴", "Bless you everything you do"))
        nameList.add(Name("다옴", "Daom", "하는 일마다 복이 옴", "Bless you everything you do"))
        nameList.add(Name("다한", "Dahan", "모든 일에 최선을 다하는", "Do your best in everything"))
        nameList.add(Name("단미", "Danmi", "사랑스러운 여자", "Lovely woman"))
        nameList.add(Name("라온", "Raon", "즐거운", "Pleasant"))
        nameList.add(Name("마루", "Maru", "하늘", "The sky"))
        nameList.add(Name("모아", "Mo-a", "늘 뜻을 모아 사는 삶", "Life that always gathers mind"))
        nameList.add(Name("미르", "Mirue", "용", "Dragon"))
        nameList.add(Name("바오", "Bao", "보기좋게", "Looks good"))
        nameList.add(Name("보미", "Bomi", "봄에 태어난 아기", "Baby born in the spring"))
        nameList.add(Name("새라", "Saera", "새롭다", "It's new"))
        nameList.add(Name("새나", "Saena", "새가 나는 것처럼 자유롭고 아름다움", "Free and beautiful as birds fly"))
        nameList.add(Name("새론", "Saeron", "늘 새로운 사람", "Always a new person"))
        nameList.add(Name("소미", "Somi", "솜과 같이 부드럽다", "Soft as cotton"))
        nameList.add(Name("슬아", "Seul-a", "슬기로움과 아름다움을 지닌 사람", "The person with wisdom and beauty"))
        nameList.add(Name("아라", "Ara", "바다", "The sea"))
        nameList.add(Name("아란", "Aran", "아름답게 자란", "Beautifully grown"))
        nameList.add(Name("아람", "Aram", "탐스러운 가을 햇살을 받아 잘 익어 벌어진 과일", "The fruit that is ripe for its sunny autumn sunshine"))
        nameList.add(Name("윤슬", "Yunseul", "빛에 비치어 반짝이는 물결", "Shiny waves in the light"))
        nameList.add(Name("이든", "Ideun", "착한, 어진", "kind, benevolent"))
        nameList.add(Name("초롱", "Chorong", "맑고 영롱하고 빛나다", "Clear and bright"))
        nameList.add(Name("초아", "Choa", "초처럼 자신을 태워 세상을 비추는 사람", "The person who burns herself like a candleholder"))
        nameList.add(Name("하랑", "Harang", "함께 높이 날다", "Fly high together"))
        nameList.add(Name("하나", "Hana", "이 세상에 하나밖에 없는 소중한 아이", "One precious child in this world"))
        nameList.add(Name("한결", "Hangyeol", "한결같은 지조를 지니는 사람", "A person who keeps one's mind"))
        nameList.add(Name("한별", "Hanbyeol", "크고 밝은 별", "Big and bright Star"))
        nameList.add(Name("한울", "Han-ul", "우주", "The Universe"))
        nameList.add(Name("해솔", "Haesol", "해처럼 밝고 솔처럼 바르게", "Bright as the sun and right like a pine tree"))
    }
}





