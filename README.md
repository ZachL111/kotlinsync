# kotlinsync

`kotlinsync` keeps a focused Kotlin implementation around automation. The project goal is to plan safe file sync operations with content hashes and dry-run output.

## Problem It Tries To Make Smaller

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Kotlinsync Review Notes

The first comparison I would make is `idempotence` against `operator cost` because it shows where the rule is most opinionated.

## Working Pieces

- `fixtures/domain_review.csv` adds cases for dry-run spread and rename risk.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/kotlinsync-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `idempotence` and `operator cost`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Design Notes

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Kotlin addition stays small enough to inspect in one sitting.

## Example Run

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The same command runs the local verification path. The highest-scoring domain case is `recovery` at 234, which lands in `ship`. The most cautious case is `edge` at 167, which lands in `ship`.

## Known Limits

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
