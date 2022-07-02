object DataStructure {
    @JvmStatic
    fun main(args: Array<String>) {
        val x = MyList()
        x.add(1)
        x.add(2)
        x.add(3)
        x.add(4)
        x.add(5)
        while (x.moveNext()) {
            println(x.get())
        }
        x.moveFirst()
        x.moveNext()
        x.moveNext()
        x.delete()
        x.moveFirst()
        while (x.moveNext()) {
            println(x.get())
        }
    }

    internal class MyListItem(var prev: MyListItem?, var next: MyListItem?, var value: Int)
    internal class MyList {
        private var current: MyListItem? = null
        private var last: MyListItem? = null
        private var first: MyListItem? = null
        fun get(): Int {
            return current!!.value
        }

        fun add(value: Int) {
            val item = MyListItem(last, null, value)
            if (last != null) {
                last!!.next = item
            } else {
                first = item
            }
            last = item
        }

        fun delete() {
            if (current == null) {
                println("ERROR")
                return
            }
            val prev = current!!.prev
            if (prev != null) {
                prev.next = current!!.next
                if (current === last) {
                    last = prev
                }
                current = prev.next
            } else {
                current = null
                first = null
                last = null
            }
        }

        fun moveNext(): Boolean {
            if (current == null && first != null) {
                current = first
                return true
            }
            if (current != null) {
                current = current!!.next
                return current != null
            }
            return false
        }

        fun moveFirst() {
            current = null
        }
    }
}