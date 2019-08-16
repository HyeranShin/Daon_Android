package com.example.daon.model

import kotlin.random.Random

class NameVO constructor(name: String, pronunciation: String, meaningKor: String, meaningEng: String) {
    val name: String = name
    val pronunciation: String = pronunciation
    val meaningKo: String = meaningKor
    val meaningEn: String = meaningEng

    companion object {
        fun nameList1(): ArrayList<NameVO> {
            val totalNameList: ArrayList<NameVO> = insertNameListData()
            val selectedNameList: ArrayList<NameVO> = ArrayList()

            selectedNameList.add(totalNameList[30])
            selectedNameList.add(totalNameList[10])
            selectedNameList.add(totalNameList[32])

            return selectedNameList
        }

        fun nameList2(): ArrayList<NameVO> {
            val totalNameList: ArrayList<NameVO> = insertNameListData()
            val selectedNameList: ArrayList<NameVO> = ArrayList()

            selectedNameList.add(totalNameList[35])
            selectedNameList.add(totalNameList[0])
            selectedNameList.add(totalNameList[33])

            return selectedNameList
        }


        fun selectNameRandomly(): ArrayList<NameVO> {
            val totalNameList: ArrayList<NameVO> = insertNameListData()
            val selectedNameList: ArrayList<NameVO> = ArrayList()
            val randomIndex: ArrayList<Int> = ArrayList()

            for(i in 0..2 step 1) {
                var randomNum: Int = Random.nextInt(36)
                for (j in 0 until randomIndex.size) {
                    while(randomNum == randomIndex[j]) {
                        randomNum = Random.nextInt(36)
                    }
                }

                randomIndex.add(randomNum)
                selectedNameList.add(totalNameList[randomNum])
            }

            return selectedNameList
        }

        private fun insertNameListData(): ArrayList<NameVO> {
            var nameList: ArrayList<NameVO> = ArrayList()

            nameList.add(NameVO("김가온", "Kim-ga on", "세상의 중심이 되어라", "Be the center of the world"))
            nameList.add(NameVO("김나린", "Kim-na rin", "하늘이 내린", "The person with the sky"))
            nameList.add(NameVO("김나래", "Kim-na rae", "날개", "The wings"))
            nameList.add(NameVO("김나예", "Kim-na ye", "나비처럼 예쁘게", "Pretty as a butterfly"))
            nameList.add(NameVO("김너울", "Neoul", "바다의 큰 물결", "The big wave of the sea"))
            nameList.add(
                NameVO(
                    "김다솜",
                    "Dasom",
                    "애틋한 사람",
                    "The person who is dear, pitiful and affectionate"
                )
            )
            nameList.add(NameVO("김다원", "Dawon", "모두가 다 사랑하는 사람", "The person everyone loves"))
            nameList.add(NameVO("다온", "Daon", "좋은 모든 일들이 다 오는", "All good things come"))
            nameList.add(NameVO("다올", "Daol", "하는 일마다 복이 옴", "Bless you everything you do"))
            nameList.add(NameVO("다옴", "Daom", "하는 일마다 복이 옴", "Bless you everything you do"))
            nameList.add(NameVO("김다한", "Kim-da han", "모든 일에 최선을 다하는", "Do your best in everything"))
            //----10
            nameList.add(NameVO("단미", "Danmi", "사랑스러운 여자", "Lovely woman"))
            nameList.add(NameVO("라온", "Raon", "즐거운", "Pleasant"))
            nameList.add(NameVO("마루", "Maru", "하늘", "The sky"))
            nameList.add(NameVO("김모아", "Kim-mo a", "늘 뜻을 모아 사는 삶", "Life that always gathers mind"))
            nameList.add(NameVO("미르", "Mirue", "용", "Dragon"))
            nameList.add(NameVO("바오", "Bao", "보기좋게", "Looks good"))
            nameList.add(NameVO("김보미", "Kim-bo mi", "봄에 태어난 아기", "Baby born in the spring"))
            nameList.add(NameVO("새라", "Saera", "새롭다", "It's new"))
            nameList.add(
                NameVO(
                    "새나",
                    "Saena",
                    "새가 나는 것처럼 자유롭고 아름다움",
                    "Free and beautiful as birds fly"
                )
            )
            nameList.add(NameVO("새론", "Saeron", "늘 새로운 사람", "Always a new person"))
            //----20
            nameList.add(NameVO("소미", "Somi", "솜과 같이 부드럽다", "Soft as cotton"))
            nameList.add(
                NameVO(
                    "슬아",
                    "Seul-a",
                    "슬기로움과 아름다움을 지닌 사람",
                    "The person with wisdom and beauty"
                )
            )
            nameList.add(NameVO("아라", "Ara", "바다", "The sea"))
            nameList.add(NameVO("아란", "Aran", "아름답게 자란", "Beautifully grown"))
            nameList.add(
                NameVO(
                    "아람",
                    "Aram",
                    "탐스러운 가을 햇살을 받아 잘 익어 벌어진 과일",
                    "The fruit that is ripe for its sunny autumn sunshine"
                )
            )
            nameList.add(NameVO("윤슬", "Yunseul", "빛에 비치어 반짝이는 물결", "Shiny waves in the light"))
            nameList.add(NameVO("이든", "Ideun", "착한, 어진", "kind, benevolent"))
            nameList.add(NameVO("김초롱", "Kim-cho rong", "맑고 영롱하고 빛나다", "Clear and bright"))
            nameList.add(
                NameVO(
                    "초아",
                    "Choa",
                    "초처럼 자신을 태워 세상을 비추는 사람",
                    "The person who burns herself like a candleholder"
                )
            )
            nameList.add(NameVO("김하랑", "Kim-ha rang", "함께 높이 날다", "Fly high together"))
            //----30
            nameList.add(
                NameVO(
                    "하나",
                    "Hana",
                    "이 세상에 하나밖에 없는 소중한 아이",
                    "One precious child in this world"
                )
            )
            nameList.add(
                NameVO(
                    "김한결",
                    "Kim-han gyeol",
                    "한결같은 지조를 지니는 사람",
                    "A person who keeps one's mind"
                )
            )
            nameList.add(NameVO("김한별", "Kim-hanbyeol", "크고 밝은 별", "Big and bright Star"))
            nameList.add(NameVO("한울", "Han-ul", "우주", "The Universe"))
            nameList.add(
                NameVO(
                    "김해솔",
                    "Kim-hae sol",
                    "해처럼 밝고 솔처럼 바르게",
                    "Bright as the sun\nand right like a pine tree"
                )
            )

            return nameList
        }
    }
}