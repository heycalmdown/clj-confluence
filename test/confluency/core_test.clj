(ns confluency.core-test
  (:require [clojure.test :refer :all]
            [confluency.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (:id (page 1081356)) "1081356"))
    (is (>= (count (children 1081358)) 5))
    (is (= (map :id (:results (children 1081358))) ["1081360"
                                                         "1081362"
                                                         "1081364"
                                                         "1081366"
                                                         "1081368"
                                                         "1081370"]))))
