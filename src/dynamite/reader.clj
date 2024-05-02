(ns dynamite.reader
  (:import 
     [java.io File]
     [java.io FileReader]
     [java.nio.file Files]
     [java.nio.file Path]
     [java.nio.file FileSystems]
     [java.nio.file Paths]
     [java.net URI]))

(def numRead 10000)

(defn readFile [path] (let
  [pathy (Paths/get (URI/create (str "file:///" "home/runner/dynamite/" path)))]
   (String. (Files/readAllBytes pathy))))