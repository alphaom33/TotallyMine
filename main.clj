(ns main
  (:import 
   [java.io File]
   [java.io FileReader]))

(defn readFile [path] (let [
file (File. path)
reader (FileReader. file)
yes (char-array 10)]

  (.read reader yes 0 10)
  (.close reader)

  (String. yes)
))

(println (readFile "code/main.dym"))