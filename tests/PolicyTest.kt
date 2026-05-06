fun main() {
    val signalcase_1 = Signal(56, 90, 23, 10, 13)
    check(Policy.score(signalcase_1) == 171)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(72, 88, 16, 12, 8)
    check(Policy.score(signalcase_2) == 184)
    check(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(90, 102, 22, 23, 8)
    check(Policy.score(signalcase_3) == 172)
    check(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(76, 28, 23, 76)
    check(DomainReviewLens.score(domainReview) == 187)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
