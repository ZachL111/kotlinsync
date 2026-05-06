# Field Notes

`kotlinsync` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `dry-run spread`, `rename risk`, `operator cost`, and `idempotence`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` tells me the happy path still works. `edge` tells me whether the guardrail still has teeth.

The language-specific addition keeps the review model in a JVM-friendly data class.
