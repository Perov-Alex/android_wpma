package com.intek.wpma

class Global {

    enum class Mode{
        None, Waiting,Set, SetInicialization, SetComplete
    }

    enum class ActionSet{
        ScanAdress, ScanItem, EnterCount, ScanPart, ScanBox, ScanPallete, Waiting
    }
}